package edu.uiowa.slis.VIVOISF.territory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class territorySameAs extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static territorySameAs currentInstance = null;
	private static final Log log = LogFactory.getLog(territorySameAs.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			territorySameAsIterator theterritory = (territorySameAsIterator)findAncestorWithClass(this, territorySameAsIterator.class);
			pageContext.getOut().print(theterritory.getSameAs());
		} catch (Exception e) {
			log.error("Can't find enclosing territory for sameAs tag ", e);
			throw new JspTagException("Error: Can't find enclosing territory for sameAs tag ");
		}
		return SKIP_BODY;
	}
}

