package edu.uiowa.slis.VIVOISF.BFO_0000015;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000015Abbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000015Abbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000015Abbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000015 theBFO_0000015 = (BFO_0000015)findAncestorWithClass(this, BFO_0000015.class);
			if (!theBFO_0000015.commitNeeded) {
				pageContext.getOut().print(theBFO_0000015.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			BFO_0000015 theBFO_0000015 = (BFO_0000015)findAncestorWithClass(this, BFO_0000015.class);
			return theBFO_0000015.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing BFO_0000015 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			BFO_0000015 theBFO_0000015 = (BFO_0000015)findAncestorWithClass(this, BFO_0000015.class);
			theBFO_0000015.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000015 for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000015 for abbreviation tag ");
		}
	}
}

