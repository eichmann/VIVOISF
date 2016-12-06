package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			geographical_regionHasEmailIterator thegeographical_regionHasEmailIterator = (geographical_regionHasEmailIterator)findAncestorWithClass(this, geographical_regionHasEmailIterator.class);
			pageContext.getOut().print(thegeographical_regionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

