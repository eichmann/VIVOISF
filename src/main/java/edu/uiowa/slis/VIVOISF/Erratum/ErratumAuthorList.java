package edu.uiowa.slis.VIVOISF.Erratum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ErratumAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ErratumAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ErratumAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ErratumAuthorListIterator theErratumAuthorListIterator = (ErratumAuthorListIterator)findAncestorWithClass(this, ErratumAuthorListIterator.class);
			pageContext.getOut().print(theErratumAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Erratum for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Erratum for authorList tag ");
		}
		return SKIP_BODY;
	}
}
