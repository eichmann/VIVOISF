package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			if (!theAssociation.commitNeeded) {
				pageContext.getOut().print(theAssociation.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Association for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			return theAssociation.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Association for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			theAssociation.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Association for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for overview tag ");
		}
	}
}

