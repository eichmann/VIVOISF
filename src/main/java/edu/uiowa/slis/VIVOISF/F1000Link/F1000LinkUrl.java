package edu.uiowa.slis.VIVOISF.F1000Link;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class F1000LinkUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static F1000LinkUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(F1000LinkUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			F1000LinkUrlIterator theF1000Link = (F1000LinkUrlIterator)findAncestorWithClass(this, F1000LinkUrlIterator.class);
			pageContext.getOut().print(theF1000Link.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing F1000Link for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing F1000Link for url tag ");
		}
		return SKIP_BODY;
	}
}

