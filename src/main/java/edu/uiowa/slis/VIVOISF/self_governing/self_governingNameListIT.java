package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListITIterator theself_governing = (self_governingNameListITIterator)findAncestorWithClass(this, self_governingNameListITIterator.class);
			pageContext.getOut().print(theself_governing.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

