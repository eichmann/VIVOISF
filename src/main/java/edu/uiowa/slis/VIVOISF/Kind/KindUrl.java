package edu.uiowa.slis.VIVOISF.Kind;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class KindUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static KindUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(KindUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			KindUrlIterator theKind = (KindUrlIterator)findAncestorWithClass(this, KindUrlIterator.class);
			pageContext.getOut().print(theKind.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Kind for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Kind for url tag ");
		}
		return SKIP_BODY;
	}
}

