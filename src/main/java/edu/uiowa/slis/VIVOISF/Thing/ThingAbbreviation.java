package edu.uiowa.slis.VIVOISF.Thing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThingAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ThingAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ThingAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			if (!theThing.commitNeeded) {
				pageContext.getOut().print(theThing.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			return theThing.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Thing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Thing theThing = (Thing)findAncestorWithClass(this, Thing.class);
			theThing.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Thing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Thing for abbreviation tag ");
		}
	}
}

