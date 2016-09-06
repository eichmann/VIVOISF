package edu.uiowa.slis.VIVOISF.Neighbor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NeighborLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NeighborLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(NeighborLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Neighbor theNeighbor = (Neighbor)findAncestorWithClass(this, Neighbor.class);
			if (!theNeighbor.commitNeeded) {
				pageContext.getOut().print(theNeighbor.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Neighbor for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Neighbor for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Neighbor theNeighbor = (Neighbor)findAncestorWithClass(this, Neighbor.class);
			return theNeighbor.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Neighbor for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Neighbor for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Neighbor theNeighbor = (Neighbor)findAncestorWithClass(this, Neighbor.class);
			theNeighbor.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Neighbor for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Neighbor for label tag ");
		}
	}
}

