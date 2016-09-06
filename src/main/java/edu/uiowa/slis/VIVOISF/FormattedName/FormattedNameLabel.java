package edu.uiowa.slis.VIVOISF.FormattedName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FormattedNameLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FormattedNameLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FormattedNameLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FormattedName theFormattedName = (FormattedName)findAncestorWithClass(this, FormattedName.class);
			if (!theFormattedName.commitNeeded) {
				pageContext.getOut().print(theFormattedName.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FormattedName theFormattedName = (FormattedName)findAncestorWithClass(this, FormattedName.class);
			return theFormattedName.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FormattedName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FormattedName theFormattedName = (FormattedName)findAncestorWithClass(this, FormattedName.class);
			theFormattedName.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for label tag ");
		}
	}
}

