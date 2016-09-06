package edu.uiowa.slis.VIVOISF.FormattedName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FormattedNameFormattedName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FormattedNameFormattedName currentInstance = null;
	private static final Log log = LogFactory.getLog(FormattedNameFormattedName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FormattedNameFormattedNameIterator theFormattedName = (FormattedNameFormattedNameIterator)findAncestorWithClass(this, FormattedNameFormattedNameIterator.class);
			pageContext.getOut().print(theFormattedName.getFormattedName());
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for formattedName tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for formattedName tag ");
		}
		return SKIP_BODY;
	}
}

