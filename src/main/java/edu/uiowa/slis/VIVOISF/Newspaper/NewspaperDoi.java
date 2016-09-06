package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperDoiIterator theNewspaper = (NewspaperDoiIterator)findAncestorWithClass(this, NewspaperDoiIterator.class);
			pageContext.getOut().print(theNewspaper.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for doi tag ");
		}
		return SKIP_BODY;
	}
}

