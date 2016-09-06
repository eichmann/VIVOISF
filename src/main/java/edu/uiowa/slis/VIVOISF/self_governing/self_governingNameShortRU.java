package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNameShortRUIterator theself_governing = (self_governingNameShortRUIterator)findAncestorWithClass(this, self_governingNameShortRUIterator.class);
			pageContext.getOut().print(theself_governing.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

