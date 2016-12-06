package edu.uiowa.slis.VIVOISF.area;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class areaUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static areaUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(areaUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			areaUrlIterator thearea = (areaUrlIterator)findAncestorWithClass(this, areaUrlIterator.class);
			pageContext.getOut().print(thearea.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing area for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing area for url tag ");
		}
		return SKIP_BODY;
	}
}

