package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperUri currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperUriIterator theNewspaper = (NewspaperUriIterator)findAncestorWithClass(this, NewspaperUriIterator.class);
			pageContext.getOut().print(theNewspaper.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for uri tag ");
		}
		return SKIP_BODY;
	}
}

