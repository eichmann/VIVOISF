package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperIdentifierIterator theNewspaper = (NewspaperIdentifierIterator)findAncestorWithClass(this, NewspaperIdentifierIterator.class);
			pageContext.getOut().print(theNewspaper.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for identifier tag ");
		}
		return SKIP_BODY;
	}
}

