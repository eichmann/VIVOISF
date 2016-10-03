package edu.uiowa.slis.VIVOISF.Newspaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NewspaperOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NewspaperOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(NewspaperOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NewspaperOclcnumIterator theNewspaper = (NewspaperOclcnumIterator)findAncestorWithClass(this, NewspaperOclcnumIterator.class);
			pageContext.getOut().print(theNewspaper.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Newspaper for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Newspaper for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

