package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperSici currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperSiciIterator theNewspaper = (NewspaperSiciIterator)findAncestorWithClass(this, NewspaperSiciIterator.class);
			pageContext.getOut().print(theNewspaper.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for sici tag ");
		}
		return SKIP_BODY;
	}
}

