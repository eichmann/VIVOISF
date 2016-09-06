package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeDescriptionIterator theThesisDegree = (ThesisDegreeDescriptionIterator)findAncestorWithClass(this, ThesisDegreeDescriptionIterator.class);
			pageContext.getOut().print(theThesisDegree.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for description tag ");
		}
		return SKIP_BODY;
	}
}

