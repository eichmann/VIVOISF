package edu.uiowa.slis.VIVOISF.Explanatory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ExplanatoryUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ExplanatoryUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(ExplanatoryUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ExplanatoryUrlIterator theExplanatory = (ExplanatoryUrlIterator)findAncestorWithClass(this, ExplanatoryUrlIterator.class);
			pageContext.getOut().print(theExplanatory.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Explanatory for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Explanatory for url tag ");
		}
		return SKIP_BODY;
	}
}

