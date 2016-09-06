package edu.uiowa.slis.VIVOISF.Museum;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MuseumSponsors extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MuseumSponsors currentInstance = null;
	private static final Log log = LogFactory.getLog(MuseumSponsors.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MuseumSponsorsIterator theMuseumSponsorsIterator = (MuseumSponsorsIterator)findAncestorWithClass(this, MuseumSponsorsIterator.class);
			pageContext.getOut().print(theMuseumSponsorsIterator.getSponsors());
		} catch (Exception e) {
			log.error("Can't find enclosing Museum for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Museum for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

