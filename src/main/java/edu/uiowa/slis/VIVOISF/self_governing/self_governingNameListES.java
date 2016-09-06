package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListESIterator theself_governing = (self_governingNameListESIterator)findAncestorWithClass(this, self_governingNameListESIterator.class);
			pageContext.getOut().print(theself_governing.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

