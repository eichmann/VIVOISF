package edu.uiowa.slis.VIVOISF.Thesis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThesisDegreeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThesisDegreeType currentInstance = null;
	private static final Log log = LogFactory.getLog(ThesisDegreeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThesisDegreeIterator theThesisDegreeIterator = (ThesisDegreeIterator)findAncestorWithClass(this, ThesisDegreeIterator.class);
			pageContext.getOut().print(theThesisDegreeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Thesis for degree tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thesis for degree tag ");
		}
		return SKIP_BODY;
	}
}

