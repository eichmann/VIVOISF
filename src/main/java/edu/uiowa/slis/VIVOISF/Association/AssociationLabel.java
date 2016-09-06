package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			if (!theAssociation.commitNeeded) {
				pageContext.getOut().print(theAssociation.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Association for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			return theAssociation.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Association for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Association theAssociation = (Association)findAncestorWithClass(this, Association.class);
			theAssociation.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Association for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for label tag ");
		}
	}
}

