package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperEissn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperEissn currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperEissn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperEissnIterator theNewspaper = (NewspaperEissnIterator)findAncestorWithClass(this, NewspaperEissnIterator.class);
			pageContext.getOut().print(theNewspaper.getEissn());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for eissn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for eissn tag ");
		}
		return SKIP_BODY;
	}
}

