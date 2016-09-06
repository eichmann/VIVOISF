package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			self_governingNationalityRUIterator theself_governing = (self_governingNationalityRUIterator)findAncestorWithClass(this, self_governingNationalityRUIterator.class);
			pageContext.getOut().print(theself_governing.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

