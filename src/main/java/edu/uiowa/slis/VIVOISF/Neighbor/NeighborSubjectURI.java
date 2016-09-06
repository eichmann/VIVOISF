package edu.uiowa.slis.VIVOISF.Neighbor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NeighborSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NeighborSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(NeighborSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Neighbor theNeighbor = (Neighbor)findAncestorWithClass(this, Neighbor.class);
			if (!theNeighbor.commitNeeded) {
				pageContext.getOut().print(theNeighbor.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Neighbor for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Neighbor for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Neighbor theNeighbor = (Neighbor)findAncestorWithClass(this, Neighbor.class);
			return theNeighbor.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Neighbor for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Neighbor for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Neighbor theNeighbor = (Neighbor)findAncestorWithClass(this, Neighbor.class);
			theNeighbor.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Neighbor for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Neighbor for subjectURI tag ");
		}
	}
}

