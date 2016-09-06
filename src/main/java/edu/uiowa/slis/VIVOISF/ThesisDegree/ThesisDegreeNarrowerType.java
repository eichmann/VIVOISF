package edu.uiowa.slis.VIVOISF.ThesisDegree;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeNarrowerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeNarrowerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeNarrowerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeNarrowerIterator theThesisDegreeNarrowerIterator = (ThesisDegreeNarrowerIterator)findAncestorWithClass(this, ThesisDegreeNarrowerIterator.class);
			pageContext.getOut().print(theThesisDegreeNarrowerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ThesisDegree for narrower tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThesisDegree for narrower tag ");
		}
		return SKIP_BODY;
	}
}

