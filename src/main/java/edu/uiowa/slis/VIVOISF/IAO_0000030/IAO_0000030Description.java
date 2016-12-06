package edu.uiowa.slis.VIVOISF.IAO_0000030;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IAO_0000030Description extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IAO_0000030Description currentInstance = null;
	private static final Log log = LogFactory.getLog(IAO_0000030Description.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			IAO_0000030DescriptionIterator theIAO_0000030 = (IAO_0000030DescriptionIterator)findAncestorWithClass(this, IAO_0000030DescriptionIterator.class);
			pageContext.getOut().print(theIAO_0000030.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing IAO_0000030 for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing IAO_0000030 for description tag ");
		}
		return SKIP_BODY;
	}
}

