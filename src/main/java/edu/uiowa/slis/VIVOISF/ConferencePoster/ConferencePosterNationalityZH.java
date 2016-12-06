package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNationalityZHIterator theConferencePoster = (ConferencePosterNationalityZHIterator)findAncestorWithClass(this, ConferencePosterNationalityZHIterator.class);
			pageContext.getOut().print(theConferencePoster.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

