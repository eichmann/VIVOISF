package edu.uiowa.slis.VIVOISF.Exhibit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExhibitLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExhibitLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(ExhibitLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Exhibit theExhibit = (Exhibit)findAncestorWithClass(this, Exhibit.class);
			if (!theExhibit.commitNeeded) {
				pageContext.getOut().print(theExhibit.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Exhibit theExhibit = (Exhibit)findAncestorWithClass(this, Exhibit.class);
			return theExhibit.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Exhibit for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Exhibit theExhibit = (Exhibit)findAncestorWithClass(this, Exhibit.class);
			theExhibit.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Exhibit for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Exhibit for label tag ");
		}
	}
}

