package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperLccnIterator theNewspaper = (NewspaperLccnIterator)findAncestorWithClass(this, NewspaperLccnIterator.class);
			pageContext.getOut().print(theNewspaper.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for lccn tag ");
		}
		return SKIP_BODY;
	}
}

