package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListZHIterator theself_governing = (self_governingNameListZHIterator)findAncestorWithClass(this, self_governingNameListZHIterator.class);
			pageContext.getOut().print(theself_governing.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

