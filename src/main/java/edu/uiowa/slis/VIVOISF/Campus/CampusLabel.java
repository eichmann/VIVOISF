package edu.uiowa.slis.VIVOISF.Campus;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CampusLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CampusLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(CampusLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Campus theCampus = (Campus)findAncestorWithClass(this, Campus.class);
			if (!theCampus.commitNeeded) {
				pageContext.getOut().print(theCampus.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Campus theCampus = (Campus)findAncestorWithClass(this, Campus.class);
			return theCampus.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Campus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Campus theCampus = (Campus)findAncestorWithClass(this, Campus.class);
			theCampus.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Campus for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Campus for label tag ");
		}
	}
}

