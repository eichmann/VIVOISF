package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNationalityZHIterator theConferencePaper = (ConferencePaperNationalityZHIterator)findAncestorWithClass(this, ConferencePaperNationalityZHIterator.class);
			pageContext.getOut().print(theConferencePaper.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

