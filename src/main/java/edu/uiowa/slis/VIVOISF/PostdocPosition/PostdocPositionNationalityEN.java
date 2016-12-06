package edu.uiowa.slis.VIVOISF.PostdocPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PostdocPositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PostdocPositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PostdocPositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PostdocPositionNationalityENIterator thePostdocPosition = (PostdocPositionNationalityENIterator)findAncestorWithClass(this, PostdocPositionNationalityENIterator.class);
			pageContext.getOut().print(thePostdocPosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing PostdocPosition for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing PostdocPosition for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

