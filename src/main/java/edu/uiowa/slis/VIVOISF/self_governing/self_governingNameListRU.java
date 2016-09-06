package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameListRUIterator theself_governing = (self_governingNameListRUIterator)findAncestorWithClass(this, self_governingNameListRUIterator.class);
			pageContext.getOut().print(theself_governing.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

