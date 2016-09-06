package edu.uiowa.slis.VIVOISF.University;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UniversitySponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UniversitySponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(UniversitySponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			UniversitySponsorsIterator theUniversitySponsorsIterator = (UniversitySponsorsIterator)findAncestorWithClass(this, UniversitySponsorsIterator.class);
			pageContext.getOut().print(theUniversitySponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing University for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing University for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

