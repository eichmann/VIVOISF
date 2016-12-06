package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			if (!theConferencePaper.commitNeeded) {
				pageContext.getOut().print(theConferencePaper.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			return theConferencePaper.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing ConferencePaper for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			ConferencePaper theConferencePaper = (ConferencePaper)findAncestorWithClass(this, ConferencePaper.class);
			theConferencePaper.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for abbreviation tag ");
		}
	}
}

