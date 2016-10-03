package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperHandleIterator theNewspaper = (NewspaperHandleIterator)findAncestorWithClass(this, NewspaperHandleIterator.class);
			pageContext.getOut().print(theNewspaper.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for handle tag ");
		}
		return SKIP_BODY;
	}
}

