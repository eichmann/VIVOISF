package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			if (!theConferencePoster.commitNeeded) {
				pageContext.getOut().print(theConferencePoster.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			return theConferencePoster.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePoster for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ConferencePoster theConferencePoster = (ConferencePoster)findAncestorWithClass(this, ConferencePoster.class);
			theConferencePoster.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for abbreviation tag ");
		}
	}
}

