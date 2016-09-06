package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeRelated extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeRelated currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeRelated.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeRelatedIterator theThesisDegreeRelatedIterator = (ThesisDegreeRelatedIterator)findAncestorWithClass(this, ThesisDegreeRelatedIterator.class);
			pageContext.getOut().print(theThesisDegreeRelatedIterator.getRelated());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for related tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for related tag ");
		}
		return SKIP_BODY;
	}
}

