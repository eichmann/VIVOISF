package edu.uiowa.slis.VIVOISF.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ListTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ListTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ListTheAbstractIterator theList = (ListTheAbstractIterator)findAncestorWithClass(this, ListTheAbstractIterator.class);
			pageContext.getOut().print(theList.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing List for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

