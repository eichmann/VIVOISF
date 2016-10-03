package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperIssn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperIssn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperIssn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperIssnIterator theNewspaper = (NewspaperIssnIterator)findAncestorWithClass(this, NewspaperIssnIterator.class);
			pageContext.getOut().print(theNewspaper.getIssn());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for issn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for issn tag ");
		}
		return SKIP_BODY;
	}
}

