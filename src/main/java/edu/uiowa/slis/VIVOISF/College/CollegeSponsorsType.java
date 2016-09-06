package edu.uiowa.slis.VIVOISF.College;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CollegeSponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CollegeSponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(CollegeSponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CollegeSponsorsIterator theCollegeSponsorsIterator = (CollegeSponsorsIterator)findAncestorWithClass(this, CollegeSponsorsIterator.class);
			pageContext.getOut().print(theCollegeSponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing College for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing College for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

