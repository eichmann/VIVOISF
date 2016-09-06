package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperTheAbstractIterator theNewspaper = (NewspaperTheAbstractIterator)findAncestorWithClass(this, NewspaperTheAbstractIterator.class);
			pageContext.getOut().print(theNewspaper.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

