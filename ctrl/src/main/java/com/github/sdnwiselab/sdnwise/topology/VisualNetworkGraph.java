/*
 * Copyright (C) 2015 SDN-WISE
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.sdnwiselab.sdnwise.topology;

import com.github.sdnwiselab.sdnwise.packet.NetworkPacket;
import com.github.sdnwiselab.sdnwise.util.NodeAddress;
import org.graphstream.graph.*;

/**
 * Holder of the {@code org.graphstream.graph.Graph} object which represent the
 * topology of the wireless sensor network. This is a graphical version of the
 * NetworkGraph class.
 *
 * @author Sebastiano Milardo
 */
public final class VisualNetworkGraph extends NetworkGraph {

    /**
     * Creates the VisualNetworkGraph object. It requires a time to live for
     * each node in the network and a value representing the RSSI resolution in
     * order to consider a change of the RSSI value a change in the network.
     *
     * @param timeout the time to live for a node in seconds
     * @param rssiResolution the RSSI resolution
     */
    public VisualNetworkGraph(final int timeout, final int rssiResolution) {
        super(timeout, rssiResolution);

        System.setProperty("org.graphstream.ui.renderer",
                "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        graph.addAttribute("ui.quality");
        graph.addAttribute("ui.antialias");
        graph.addAttribute("ui.stylesheet",
                "url(" + this.getClass().getResource("/style.css") + ")");
        graph.display(true);
    }

    @Override
    public void setupNode(Node node, int batt, long now, int net, NodeAddress addr) {
        super.setupNode(node, batt, now, net, addr);
        node.addAttribute("ui.label", node.getId());
        if (net < NetworkPacket.THRES) {
            node.changeAttribute("ui.style", "fill-color: rgb(0," + batt + ",0),rgb(0,0,0);");
        } else {
            node.changeAttribute("ui.style", "fill-color: rgb(" + batt + ",0,0),rgb(0,0,0);");
        }
    }

    @Override
    public void updateNode(Node node, int batt, long now) {
        super.updateNode(node, batt, now);
        if (node.getAttribute("net") != null) {
            int net = node.getAttribute("net");

            if (net < 63) {
                node.changeAttribute("ui.style", "fill-color: rgb(0," + batt + ",0),rgb(0,0,0);");
            } else {
                node.changeAttribute("ui.style", "fill-color: rgb(" + batt + ",0,0),rgb(0,0,0);");
            }
        }
    }

    @Override
    public void setupEdge(Edge edge, int newLen) {
        super.setupEdge(edge, newLen);
        int w = 30 + Math.min((((Math.max(255 - newLen, 180)) - 180) * 3), 255);
        edge.changeAttribute("ui.style", "fill-color: rgba(0,0,0," + w + ");");
        edge.changeAttribute("ui.style", "arrow-shape: arrow;");
        edge.changeAttribute("ui.style", "arrow-size: 5px,2px;");
    }

    @Override
    public void updateEdge(Edge edge, int newLen) {
        super.updateEdge(edge, newLen);
        int w = 30 + Math.min((((Math.max(255 - newLen, 180)) - 180) * 3), 255);
        edge.changeAttribute("ui.style", "fill-color: rgba(0,0,0," + w + ");");
    }
}
