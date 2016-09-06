package edu.uiowa.slis.VIVOISF.Competition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CompetitionBFO_0000055Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CompetitionBFO_0000055Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CompetitionBFO_0000055Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CompetitionBFO_0000055Iterator theCompetitionBFO_0000055Iterator = (CompetitionBFO_0000055Iterator)findAncestorWithClass(this, CompetitionBFO_0000055Iterator.class);
			pageContext.getOut().print(theCompetitionBFO_0000055Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Competition for BFO_0000055 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Competition for BFO_0000055 tag ");
		}
		return SKIP_BODY;
	}
}

