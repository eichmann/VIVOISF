package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governing thenon_self_governing = (non_self_governing)findAncestorWithClass(this, non_self_governing.class);
			if (!thenon_self_governing.commitNeeded) {
				pageContext.getOut().print(thenon_self_governing.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			non_self_governing thenon_self_governing = (non_self_governing)findAncestorWithClass(this, non_self_governing.class);
			return thenon_self_governing.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing non_self_governing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			non_self_governing thenon_self_governing = (non_self_governing)findAncestorWithClass(this, non_self_governing.class);
			thenon_self_governing.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for abbreviation tag ");
		}
	}
}

