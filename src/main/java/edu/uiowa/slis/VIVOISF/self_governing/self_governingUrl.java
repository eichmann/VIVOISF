package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingUrlIterator theself_governing = (self_governingUrlIterator)findAncestorWithClass(this, self_governingUrlIterator.class);
			pageContext.getOut().print(theself_governing.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for url tag ");
		}
		return SKIP_BODY;
	}
}

