package edu.uiowa.slis.VIVOISF.ARG_2000379;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ARG_2000379Url extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ARG_2000379Url currentInstance = null;
	private static final Log log = LogFactory.getLog(ARG_2000379Url.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ARG_2000379UrlIterator theARG_2000379 = (ARG_2000379UrlIterator)findAncestorWithClass(this, ARG_2000379UrlIterator.class);
			pageContext.getOut().print(theARG_2000379.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing ARG_2000379 for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing ARG_2000379 for url tag ");
		}
		return SKIP_BODY;
	}
}

