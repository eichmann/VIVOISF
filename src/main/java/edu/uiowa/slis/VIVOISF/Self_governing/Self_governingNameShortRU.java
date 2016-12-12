package edu.uiowa.slis.VIVOISF.Self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Self_governingNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Self_governingNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(Self_governingNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			Self_governingNameShortRUIterator theSelf_governing = (Self_governingNameShortRUIterator)findAncestorWithClass(this, Self_governingNameShortRUIterator.class);
			pageContext.getOut().print(theSelf_governing.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Self_governing for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Self_governing for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

