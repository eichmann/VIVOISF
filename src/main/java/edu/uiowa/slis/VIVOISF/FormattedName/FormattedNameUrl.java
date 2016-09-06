package edu.uiowa.slis.VIVOISF.FormattedName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FormattedNameUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FormattedNameUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(FormattedNameUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FormattedNameUrlIterator theFormattedName = (FormattedNameUrlIterator)findAncestorWithClass(this, FormattedNameUrlIterator.class);
			pageContext.getOut().print(theFormattedName.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing FormattedName for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing FormattedName for url tag ");
		}
		return SKIP_BODY;
	}
}

