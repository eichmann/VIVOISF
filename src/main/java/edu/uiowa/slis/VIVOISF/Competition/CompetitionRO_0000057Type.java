package edu.uiowa.slis.VIVOISF.Competition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompetitionRO_0000057Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompetitionRO_0000057Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompetitionRO_0000057Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompetitionRO_0000057Iterator theCompetitionRO_0000057Iterator = (CompetitionRO_0000057Iterator)findAncestorWithClass(this, CompetitionRO_0000057Iterator.class);
			pageContext.getOut().print(theCompetitionRO_0000057Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for RO_0000057 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for RO_0000057 tag ");
		}
		return SKIP_BODY;
	}
}

